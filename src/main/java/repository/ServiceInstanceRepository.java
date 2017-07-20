package repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import model.ServiceInstance;

public interface ServiceInstanceRepository extends MongoRepository<ServiceInstance, String> {
}
