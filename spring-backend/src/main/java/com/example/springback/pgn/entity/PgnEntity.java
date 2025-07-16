package com.example.springback.pgn.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pgn_file")
public class PgnEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    private String originalFileName;

    private String storedFileName;

    private String filePath;

    @Enumerated(EnumType.STRING)
    private GameResult result;

    private LocalDateTime uploadedAt;
}
