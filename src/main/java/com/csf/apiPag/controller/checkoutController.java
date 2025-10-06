package com.csf.apiPag.controller;

import com.csf.apiPag.dto.CheckoutDto.CheckoutDto;
import com.csf.apiPag.entity.Checkout;
import com.csf.apiPag.service.PagSeguroClient;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/checkouts")
public class checkoutController {

    @Autowired
    private PagSeguroClient checkoutService;

    @PostMapping
    public ResponseEntity<Checkout> createCheckout(@Valid @RequestBody CheckoutDto checkoutDto) {
        return new ResponseEntity<>(checkoutService.createCheckout(checkoutDto), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Checkout> getCheckout(@PathVariable String id) {
        return new ResponseEntity<>(checkoutService.getCheckoutFromAPI(id), HttpStatus.OK);
    }

    @PostMapping("/{id}/inactivate")
    public ResponseEntity<Checkout> inactivateCheckout(@PathVariable String id) {
        return new ResponseEntity<>(checkoutService.deactivateCheckout(id), HttpStatus.OK);
    }

    @PostMapping("/{id}/activate")
    public ResponseEntity<Checkout> activateCheckout(@PathVariable String id) {
        return new ResponseEntity<>(checkoutService.activateCheckout(id), HttpStatus.OK);
    }
}
