package com.crud.tasks.controller;


import com.crud.tasks.domain.TrelloBoardDto;
import com.crud.tasks.domain.TrelloCardDto;
import com.crud.tasks.service.TrelloService;
import com.crud.tasks.trello.client.CreatedTrelloCard;
import com.crud.tasks.trello.client.TrelloClient;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.logging.Logger;

import static java.util.Optional.ofNullable;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/trello")
public class TrelloController {

    @Autowired
    private TrelloService trelloService;

    @RequestMapping(method = RequestMethod.GET, value = "getTrelloBoards")
    public List<TrelloBoardDto> getTrelloBoards() {
        return trelloService.fetchTrelloBoards();

    }

    @RequestMapping(method =RequestMethod.POST, value = "createTrelloCard")
    public CreatedTrelloCard createTrelloCard(@RequestBody TrelloCardDto trelloCardDto) {
      return trelloService.createdTrelloCard(trelloCardDto);
    }

}
