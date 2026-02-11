package com.coach.board_backend;
import jakarta.persistence.*;

@Entity
@Table(name = "tactic")
public class Tactic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(columnDefinition = "JSON")
    private String framesJson;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getFramesJson() {
        return framesJson;
    }
    public void setFramesJson(String framesJson) {
        this.framesJson = framesJson;
    }
}
