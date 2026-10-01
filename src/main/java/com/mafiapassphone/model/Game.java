package com.mafiapassphone.model;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private final String id;
    private final List<Player> players;
    private GamePhase phase;
    private int round;

    public Game(String id) {
        this.id = id;
        this.players = new ArrayList<>();
        this.phase = GamePhase.SETUP;
        this.round = 1;
    }

    public String getId() {
        return id;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public GamePhase getPhase() {
        return phase;
    }

    public void setPhase(GamePhase phase) {
        this.phase = phase;
    }

    public int getRound() {
        return round;
    }

    public void incrementRound() {
        round++;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }
}