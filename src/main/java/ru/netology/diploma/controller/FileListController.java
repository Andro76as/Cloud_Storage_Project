package ru.netology.diploma.controller;

import ru.netology.diploma.dto.FileResponseDto;
import ru.netology.diploma.service.FileService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/list")
public class FileListController {

    private final FileService service;

    @GetMapping
    List<FileResponseDto> getAllFiles(@RequestHeader("auth-token") String authToken,
                                      @RequestParam("limit") Integer limit) {
        return service.getAllFiles(authToken, limit);
    }
}
