package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.Set;

public interface CategoryRepository extends CrudRepository<Category, String> {

    Optional<Category> findByDescription(String description);

    Set<Category> findAll();
}
