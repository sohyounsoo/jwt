package me.sohyounsoo.jwttutorial.repository;

import me.sohyounsoo.jwttutorial.entity.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    /*
    @EntityGraph(attributePaths) 어노테이션은 해당 쿼리가 수행될때 Lazy 조회가 아닌 Eager 조회로 authorities 정보를 조인해서 가져오게 됩니다.
     */
    @EntityGraph(attributePaths = "authorities")
    Optional<User> findOneWithAuthoritiesByUsername(String username);
}
