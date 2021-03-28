package com.besolid.education.model;

import com.yahoo.elide.annotation.Include;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@NoArgsConstructor
@Table(schema = "education", name = "lessons")
@Include(type = "lessons")
public class Lesson extends EduContainer{
    @Column(name = "lesson_attr")
    private String lessonAttribute;

}
