package com.mafiapassphone.service;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import com.mafiapassphone.model.Game;
import com.mafiapassphone.model.Player;

@Service
public class GameService {

    private final Map<String, Game> games = new ConcurrentHashMap<>();

    public Game createGame() {
        String gameId = UUID.randomUUID().toString();
        Game game = new Game(gameId);

        games.put(gameId, game);

        return game;
    }

    public Game getGame(String gameId) {
        return games.get(gameId);
    }

    public Player addPlayer(String gameId, String playerName) {
        Game game = getGame(gameId);

        if (game == null) {
            throw new IllegalArgumentException("Game not found");
        }

        String playerId = UUID.randomUUID().toString();
        Player player = new Player(playerId, playerName, null);

        game.addPlayer(player);

        return player;
    }
}