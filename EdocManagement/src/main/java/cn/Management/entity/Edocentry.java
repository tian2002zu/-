package cn.Management.entity;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
public class Edocentry {
    private Integer id;
    private Integer categoryId;
    private String title;
    private String summary;
    private String uploaduser;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdate;
    private String time;
}
