package domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author : KhoiVu
 * @created : 27/7/24, Saturday
 * @Description:
 **/
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String title;
    private String isbn; //International Standard Book Number, Mã số tiêu chuẩn quốc tế cho sách)
    private String publisher;

    @Column(name = "author_id")
    private Long authorId;

}
