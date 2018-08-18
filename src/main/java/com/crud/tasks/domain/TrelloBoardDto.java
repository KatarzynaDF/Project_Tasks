package com.crud.tasks.domain;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@Getter
//@AllArgsConstructor
@NoArgsConstructor


public class TrelloBoardDto {
    private String name;
    private String id;

    public Optional getId(){
        return Optional.ofNullable(id);
    }

    public Optional getName(){
        return Optional.ofNullable(name);
    }
}
