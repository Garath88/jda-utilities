package com.jagrosh.jdautilities.commons.utils;

import java.util.List;
import java.util.Objects;

import com.jagrosh.jdautilities.command.CommandEvent;

import net.dv8tion.jda.core.entities.Member;

public final class UserUtil {
    private UserUtil() {
    }

    public static boolean hasRequiredRole(CommandEvent event, List<String> requiredRoles) {
        if (requiredRoles != null) {
            Member member = getMember(event);
            return requiredRoles.stream()
                .anyMatch(role -> hasRole(member, role));
        }
        return true;
    }

    private static Member getMember(CommandEvent event) {
        return event.getJDA().getGuilds().stream()
            .map(guild -> guild.getMember(event.getAuthor()))
            .filter(Objects::nonNull)
            .findFirst()
            .orElseThrow(IllegalStateException::new);
    }

    private static boolean hasRole(Member member, String requiredRole) {
        return member.getRoles().stream()
            .anyMatch(role -> role.getName().equalsIgnoreCase(requiredRole));
    }
}
