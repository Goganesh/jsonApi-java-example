package com.besolid.education.model;

import com.yahoo.elide.annotation.Include;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(schema = "education", name = "education_relations")
@Include(rootLevel = true, type = "relations")
public class EducationRelation {
    @Id
    private UUID id;
    @ManyToOne
    @JoinColumn(name="container_id1", nullable=false)
    private EduContainer eduContainer1;
    @ManyToOne
    @JoinColumn(name="container_id2", nullable=false)
    private EduContainer eduContainer2;
    @Column(name = "relation_type")
    @Enumerated(EnumType.STRING)
    private RelationType type;
}
