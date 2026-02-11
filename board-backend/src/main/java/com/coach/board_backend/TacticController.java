package com.coach.board_backend;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/tactics")
@CrossOrigin(origins="*")
public class TacticController {
    private final TacticRepository repo;
    public TacticController(TacticRepository repo) {
        this.repo = repo;
    }
    @PostMapping
    public Tactic save(@RequestBody TacticDto dto) {//保存战术
        Tactic t = new Tactic();//创建实体对象
        t.setTitle(dto.getTitle());
        t.setFramesJson(dto.getFramesJson());
        return repo.save(t);//保存到数据库并返回保存后的对象（包含ID）
    }
    @GetMapping("/{id}")
    public Tactic get(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }
    @GetMapping //查询全部战术
    public List<Tactic> listAll(){
        return repo.findAll();
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        repo.deleteById(id);
    }
    @PutMapping("/{id}")
    public Tactic update(@PathVariable Long id,@RequestBody TacticDto dto){ //按照dto更新战术
        Tactic t=repo.findById(id).orElseThrow();
        t.setTitle(dto.getTitle());
        t.setFramesJson(dto.getFramesJson());
        return repo.save(t);
    }
}