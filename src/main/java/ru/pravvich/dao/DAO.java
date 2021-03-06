package ru.pravvich.dao;


import ru.pravvich.model.Propose;
import ru.pravvich.model.User;

import java.util.List;
import java.util.Set;

public interface DAO {
    /**
     * Get user by login & password.
     */
    User getUser(String login, String password);

    /**
     * Get propose by Propose id.
     */
    Propose getProposeById(int id);

    /**
     * Get all Proposes which contain in database.
     *
     * @return all proposes.
     */
    List<Propose> getAllProposes();

    /**
     * Addition new propose.
     */
    void addPropose(Propose propose);

    /**
     * Get all unique marks set.
     */
    List<String> getMarks();

    /**
     * Get all models corresponded mark of Car.
     */
    List<String> getModelsByMark(String mark);

    /**
     * Select all propose with valid mark and model.
     */
    List<Propose> selectBy(final String mark, final String model);

    /**
     * Update propose.
     *
     * @param propose new state.
     */
    void update(Propose propose);

    /**
     * Addition user to table users.
     */
    void addUser(User user);
}
