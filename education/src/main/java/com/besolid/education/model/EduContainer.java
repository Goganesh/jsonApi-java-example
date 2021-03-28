package com.besolid.education.model;

import com.yahoo.elide.annotation.Include;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(schema = "education", name = "edu_containers")
@Include(type = "containers")
public class EduContainer {
    @Id
    private UUID id;
    @Column(name = "cont_name")
    private String name;
    private String description;
    @Column(name = "container_type")
    @Enumerated(EnumType.STRING)
    private ContainerType containerType;
    @OneToMany(mappedBy = "eduContainer1")
    private List<EducationRelation> relations;
}
