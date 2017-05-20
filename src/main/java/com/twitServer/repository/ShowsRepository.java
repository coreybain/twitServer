package com.twitServer.repository;

import com.twitServer.model.Shows;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Corey Baines on 18/05/2017.
 */
public interface ShowsRepository extends MongoRepository<Shows, String> {

    Shows findByShowId(int showID);

}
