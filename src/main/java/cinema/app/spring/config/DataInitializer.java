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
        User admin = new User();
        admin.setEmail("admin@gmail.com");
        admin.setPassword("1234");
        admin.setRoles(Set.of(adminRole, userRole));
        userService.add(admin);
        User user = new User();
        user.setEmail("user@gmail.com");
        admin.setPassword("1234");
        admin.setRoles(Set.of(userRole));
        userService.add(user);
    }
}
