package repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import model.ServiceBinding;

public interface ServiceBindingRepository extends MongoRepository<ServiceBinding,String> {
}
