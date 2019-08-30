package guru.springframework.repositories;

import guru.springframework.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

    Optional<Ingredient> findByDescription(String description);
}
