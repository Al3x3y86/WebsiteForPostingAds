package sky.diplom.diplom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import sky.diplom.diplom.entity.AdsComment;

import java.util.Collection;
import java.util.Optional;


@Repository
public interface AdsCommentRepository extends JpaRepository<AdsComment, Long> {

    Optional<AdsComment> findByIdAndAdId(long id, long adsId);

    Collection<AdsComment> findAllByAdId(long adId);

    void deleteAdsCommentsByAdId(long id);
}