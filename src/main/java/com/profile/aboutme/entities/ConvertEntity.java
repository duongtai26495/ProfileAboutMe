package com.profile.aboutme.entities;

public class ConvertEntity {
    public static UserDTO convertToDTO(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setFull_name(user.getFull_name());
        userDTO.setUsername(user.getUsername());
        userDTO.setEmail(user.getEmail());
        userDTO.setGender(user.getGender());
        userDTO.setId(user.getUser_id());
        userDTO.setActive(user.getActive());
        userDTO.setJoined_at(user.getJoined_at());
        userDTO.setLast_edited(user.getLast_edited());
        userDTO.setRole(user.getRole());
        userDTO.setProfile_image(user.getProfile_image());
        userDTO.setSocials(user.getSocials());
        userDTO.setUser_description(user.getUser_description());
        userDTO.setQrcode_url(user.getQrcode_url());
        return userDTO;
    }
}
