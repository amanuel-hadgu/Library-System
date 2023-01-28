package com.project.BooksQueryService.service.dto;

import com.project.BooksQueryService.domain.Review;

public class ReviewAdapter {
    public static ReviewDTO toDTO(Review review) {
        ReviewDTO reviewDTO = new ReviewDTO();
        reviewDTO.setIsbn(review.getIsbn());
        reviewDTO.setRating(review.getRating());
        reviewDTO.setDescription(review.getDescription());
        reviewDTO.setCustomerName(review.getCustomerName());

        return reviewDTO;
    }

    public static Review fromDTO(ReviewDTO reviewDTO) {
        Review review = new Review();
        review.setIsbn(reviewDTO.getIsbn());
        review.setRating(reviewDTO.getRating());
        review.setDescription(reviewDTO.getDescription());
        review.setCustomerName(reviewDTO.getCustomerName());

        return review;
    }
}
