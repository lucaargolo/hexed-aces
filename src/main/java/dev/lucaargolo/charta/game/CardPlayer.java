package dev.lucaargolo.charta.game;

import net.minecraft.resources.ResourceLocation;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface CardPlayer {

    List<Card> getHand();
    void handUpdated();
    ResourceLocation getTexture();
    CompletableFuture<Card> getPlay(CardGame game);
    void setPlay(CompletableFuture<Card> play);

}
