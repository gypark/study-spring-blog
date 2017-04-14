package com.millky.blog.domain.model.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Post {
    @Id
    @GeneratedValue
    int id;

    @NotNull
    @Size(min = 1, max = 255)
    @Column(nullable = false)
    String title;

    @Size(max = 255)
    String subtitle;
    
    @NotNull
    @Size(min = 1, max = 100000000)
    @Column(length = 100000000, nullable = false)
    String content;
    
    Date regDate;

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Post [id=" + id + ", subject=" + title + ", content=" + content + ", regDate=" + regDate
                + ", subtitle=" + subtitle + "]";
    }
}
