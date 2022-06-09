package stefan.anglersparadise.model.entity;

import stefan.anglersparadise.model.entity.enums.RoleNameEnum;

import javax.persistence.*;

@Entity
@Table(name = "user_roles")
public class UserRoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private RoleNameEnum role;

    public Long getId() {
        return id;
    }

    public UserRoleEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public RoleNameEnum getRole() {
        return role;
    }

    public UserRoleEntity setRole(RoleNameEnum role) {
        this.role = role;
        return this;
    }
}
