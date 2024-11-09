package com.josewilliansl.taskmanager.entities;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    public enum Status {

        ADMIN(1l),
        COMMON(2l),
        MANAGER(3l),
        MEMBER(4l),
        LEADER(5l);

        long id;

        Status(long id){
            this.id = id;
        }

        public long getId(){
            return id;
        }

    }

}
