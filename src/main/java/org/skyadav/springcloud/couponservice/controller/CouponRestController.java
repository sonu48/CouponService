package org.skyadav.springcloud.couponservice.controller;

import org.skyadav.springcloud.couponservice.model.Coupon;
import org.skyadav.springcloud.couponservice.repos.CouponRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/couponapi")
public class CouponRestController {

    @Autowired
    CouponRepo couponRepo;

    @PostMapping(value = "/coupons")
    public Coupon creat(@RequestBody Coupon coupon){
        return couponRepo.save(coupon);
    }

    @GetMapping("/coupons/{code}")
    public Coupon getCoupon(@PathVariable("code") String code){
        return couponRepo.findByCode(code);
    }
}
