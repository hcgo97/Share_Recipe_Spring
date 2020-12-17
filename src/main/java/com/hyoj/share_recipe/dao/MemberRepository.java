package com.hyoj.share_recipe.dao;

import com.hyoj.share_recipe.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, String> {

    int countByUserid(String userid);

    Optional<MemberEntity> findByEmail(String email);

    Optional<MemberEntity> findByUserid(String userid);

}
