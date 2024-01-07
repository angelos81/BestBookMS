package com.msa.bestbook.domain.model.event;

import com.msa.bestbook.domain.model.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class ItemRented implements Serializable {
    private static final long serialVersionUID = -2956792577262963815L;

    private IDName idName;
    private Item item;
    private long point;
}
