package ir.maktab.presentation;

import ir.maktab.service.RatingService;

public class Main {
    private static final RatingService ratingService = RatingService.getInstance();
    public static void main(String[] args) {
        ratingService.readRecords();
    }
}
