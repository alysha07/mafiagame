package com.mafiapassphone.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mafiapassphone.model.Game;
import com.mafiapassphone.model.Player;
import com.mafiapassphone.service.GameService;

@RestController
@RequestMapping("/api/game")
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @PostMapping
    public Game createGame() {
        return gameService.createGame();
    }

    @GetMapping("/{gameId}")
    public Game getGame(@PathVariable String gameId) {
        return gameService.getGame(gameId);
    }

    @PostMapping("/{gameId}/players")
    public Player addPlayer(
            @PathVariable String gameId,
            @RequestBody Map<String, String> request) {

        String playerName = request.get("name");

        return gameService.addPlayer(gameId, playerName);
    }
}