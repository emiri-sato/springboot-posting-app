package com.example.postingapp.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PostEditForm {
    @NotBlank(message = "タイトルを入力してください。")
    @Size(max=40, message="最大文字数は40文字です")
    private String title;

    @NotBlank(message = "本文を入力してください。")
    @Size(max=200, message="最大文字数は200文字です")
    private String content;
}