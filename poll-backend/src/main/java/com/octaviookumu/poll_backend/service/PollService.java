package com.octaviookumu.poll_backend.service;

import com.octaviookumu.poll_backend.entity.Poll;
import com.octaviookumu.poll_backend.repository.PollRepository;
import org.springframework.stereotype.Service;

@Service
public class PollService {

    private final PollRepository pollRepository;

    public PollService(PollRepository pollRepository) {
        this.pollRepository = pollRepository;
    }

    public Poll createPoll(Poll poll) {
        return pollRepository.save(poll);
    }
}
