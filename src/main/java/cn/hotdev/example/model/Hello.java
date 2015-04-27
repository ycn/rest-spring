package cn.hotdev.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by andy on 4/26/15.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Hello {
    private long id;
    private String content;
    private String msg;
}
