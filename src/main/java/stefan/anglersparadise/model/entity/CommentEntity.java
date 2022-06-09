package stefan.anglersparadise.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comments")
public class CommentEntity extends BaseEntity {

    @Column(nullable = false)
    private String text;
    @ManyToOne
    private UserEntity sender;
    @ManyToOne
    private DamEntity dam;

    public String getText() {
        return text;
    }

    public CommentEntity setText(String text) {
        this.text = text;
        return this;
    }

    public UserEntity getSender() {
        return sender;
    }

    public CommentEntity setSender(UserEntity sender) {
        this.sender = sender;
        return this;
    }

    public DamEntity getDam() {
        return dam;
    }

    public CommentEntity setDam(DamEntity dam) {
        this.dam = dam;
        return this;
    }
}
