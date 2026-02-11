package com.coach.board_backend;//把当前文件放进包里，否则Spring启动类同包扫描时找不到
import org.springframework.web.bind.annotation.*;//一次性导入Spring的Web注解
@RestController//所有方法默认是@ResponseBody（直接写字符串/JSON到HTTP响应体）
@RequestMapping("/api")//给当前类的所有方法统一添加请求路径前缀/api
@CrossOrigin(origins="*")//允许跨域请求
public class HelloController {
    @GetMapping("/hello")//前端发来fetch请求，后端处理GET请求，路径是/api/hello
    public String sayHello() {
        return "Hello, Board Backend!";//此字符串将会在前端fetch的时候返回给前端
    }
}         