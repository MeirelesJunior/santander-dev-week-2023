package neo.meireles.service;

import neo.meireles.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
