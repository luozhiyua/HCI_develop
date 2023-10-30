package com.example.travelre.pojo.vo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SceneDetailVO {
    private Long id;

    private String sceneName;

    private String sceneAddr;

    private double sceneScore;

    private String sceneUrl1;
    private String sceneUrl2;
    private String sceneUrl3;

    private String sceneDetail;

    private Long cityID;

}
