package org.orinaldaramg.repositories;

import org.orinaldaramg.entities.BoardView;
import org.orinaldaramg.entities.BoardViewId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface BoardViewRepository extends JpaRepository<BoardView, BoardViewId>, QuerydslPredicateExecutor<BoardView> {

    /**
     * 게시글별 조회수 조회
     *
     * @param id
     * @return
     */

    default long getHit(Long id){
        QboardView boardView = QboardView.boardView;
        return count(boardView.id.eq(id));
    }

}
