package com.mafiapassphone.model;

public class Player {

    private String id;
    private String name;
    private Role role;
    private boolean alive;

    public Player(String id, String name, Role role) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.alive = true;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}