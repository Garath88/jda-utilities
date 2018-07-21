package com.jagrosh.jdautilities;

import java.util.List;
import java.util.Optional;

import com.jagrosh.jdautilities.command.CommandEvent;

import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.Role;

public final class UserUtil {

    public static boolean hasRequiredRole(CommandEvent event, List<String> requiredRoles) {
        if (requiredRoles != null) {
            return requiredRoles.stream()
                .anyMatch(role -> hasRole(event, role));
        }
        return true;
    }

    private static boolean hasRole(CommandEvent event, String requiredRole) {
        Optional<List<Role>> roles = Optional.ofNullable(event.getMember())
            .map(Member::getRoles);
        return roles.map(roles1 -> roles1.stream()
            .anyMatch(role -> role.getName().equalsIgnoreCase(requiredRole)))
            .orElse(false);

    }
}
