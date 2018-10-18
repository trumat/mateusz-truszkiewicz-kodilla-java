package com.kodilla.patterns.builder.checkers;

public class FigureFactory {
    public static final String PAWN = "PAWN";
    public static final String QUEEN = "QUEEN";

    public static Figure makeFigure(String figureType, String color) {
        if (figureType == PAWN) {
            return new Pawn(color);
        } else if (figureType == QUEEN) {
            return new Queen(color);
        } else {
            throw new IllegalStateException("Type of figure should be pawn or queen");
        }
    }
}
