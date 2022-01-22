package teste.youtube.course.model;

import javax.validation.constraints.NotNull;


import lombok.Data;
import lombok.EqualsAndHashCode;


import javax.persistence.*;

@Entity
@Data
public class Course implements AbstractEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    @NotNull(message = "The field 'title' is mandatory")
    @Column(nullable = false)
    private String title;
}
