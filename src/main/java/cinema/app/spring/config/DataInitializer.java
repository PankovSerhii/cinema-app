package cinema.app.spring.config;

import cinema.app.spring.model.Role;
import cinema.app.spring.model.User;
import cinema.app.spring.service.RoleService;
import cinema.app.spring.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    public DataInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRoleName(Role.RoleName.ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setRoleName(Role.RoleName.USER);
        roleService.add(userRole);
        User user = new User();
        user.setEmail("admin@gmail.com");
        user.setPassword("1234");
        user.setRoles(Set.of(adminRole, userRole));
        userService.add(user);
    }
}
