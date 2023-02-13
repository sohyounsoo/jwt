package me.sohyounsoo.jwttutorial.repository;

import me.sohyounsoo.jwttutorial.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
