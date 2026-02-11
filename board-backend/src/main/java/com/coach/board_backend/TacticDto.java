package com.coach.board_backend;
public class TacticDto {
    private String title;
    private String framesJson;
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
//数据传输对象（DTO），用于在前端和后端之间传递战术数据，包含战术标题和球员位置的JSON字符串