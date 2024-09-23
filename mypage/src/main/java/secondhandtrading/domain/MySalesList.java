package secondhandtrading.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "MySalesList_table")
@Data
public class MySalesList {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long userId;

    private Long postId;
    private String status;
    private Date createDt;
    private Date updateDt;
    private Integer price;
    private String rating;
}
