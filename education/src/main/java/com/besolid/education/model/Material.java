package com.besolid.education.model;

import com.yahoo.elide.annotation.Include;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(schema = "education", name = "materials")
@Include(type = "materials")
public class Material extends EduContainer{
    @Column(name = "material_attr")
    private String materialAttribute;

}
