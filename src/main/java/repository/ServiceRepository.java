package repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import model.Service;

public interface ServiceRepository extends MongoRepository<Service, String> {
}
