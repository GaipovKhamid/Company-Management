# Company-Management

***** Talablar *****
Permanent - doimiy
Seasonal - sezonniy, mavsumiy
Temporary - vaqtinchalik

PermanentEmployee - doimiy ishchi.
SeasonalEmployee - mavsumiy.
TemporaryEmployee - vaqtinchalik


1. addPermanentEmployee metodi  vaqtinchlik qo'shish uchun ishatiladi.
2. addSeasonalEmployee  metodi mavsumiy ishchilarni qo'shish uchun ishlatiladi.
3. addTemporaryEmployee  metodi vaqtinchailik ishchilarni qo'shish uchun ishlatiladi.
4. printAllEmployeeDetail  metodi barcha ishchilarni to'liq malumotini konsolga chiqaradi.
                            (Employee, Permanent,Seasonal,Temporary).
5. printEmployeeType metodi Barcha ishchilarni isim + familiyasini  va  tipini konsolga chiqaraid.
                                Namuna:
                                Ali + Aliyev + Permanent
                                Vali + Valiyev + Permanent
                                Axmad + Axmadov + Seasonal
6. showAllEmployeeBonus metod ishchilar oladigan bonuslarni hisoblab konsolga chiqaradi.
            Bunda ishchilanring oyligini qanchadir foizi bonus hisoblanadi. (Permanent-50,Seasonal-20,Temporary-0)
            Namuna:
                Ali ALiyev  - 100
                Valie Valiyev 200


7. showAllPensionTax metod ishchilardan olib qolinadigan pensiya miqdorini chiqaradi.
            (Permanent-7.5%, Seasonal-6.5%,Temporary-0)
             Namuna:
                Ali aliyev  - 750
                Vali Valiyev - 500

8. showAllInsuranceTax  metod barcha ishchilar uchun sug'urta miqdorini konsolga chiqaradi.
                (Permanent-1%,Seasonal-0.5%,Temporary-0)
                Namuna:
                    Ali aliyev  - 10
                    Vali Valiyev - 5


9. showAllSalaryAfterAllTaxes metod barcha soliqlardan keyin bechora ishchiar oladigan oylikni ko'rsatadi.
            Namuna:
                    Ali aliyev  - 730
                    Vali Valiyev - 543

            Hint (maslahat) use  calculateSalaryAfterAllTaxes() method mazgi.


10. Quyida ishlatilgan  barcha konstant qiymatlarni alohida klass va o'zgaruvchilarga chiqaring.
       Mazgi Bonus, Pensiya, Soliq larni aniqlashtiradigan constante sonlarni alohida class ga chiqaring.
        Namuna:
            Constants(bonusPermanent = 50,bonusSeasonal - 20,..... )

11. Projectda qaysidir sonning nechidir foizni ko'p joyda hisobanyapdi.
        Shu foizni hisoblash qismini Alohida PercentageCalculateUtil class yaratib
        unda static calculatePercentage metod yarratib shu metoda hisoblang.


   Just Think about it?
.What if we are adding new type of Employee. PartnerEmployee (xamkor xodim) (Tax - 0, Insurance - 0, Bonus - 75%)
.What if we are adding new type of Employee. EarEmployee (quloq xodim) (Tax - 1, Insurance - 1, Bonus - 1%)



1. addPermanentEmployee - using only getter_setter methods
2. addSeasonalEmployee - using only getter_setter methods
3. addTemporaryEmployee - using only getter_setter methods
4. Create Employee Class and use inheritance with Permanent,Seasonal,Temporary classes
5. Set values throw constructor in Employee, Permanent,Seasonal,Temporary classes
6. printAllEmployeeDetail - with getDetail method in (Employee, Permanent,Seasonal,Temporary).
7. printEmployeeType - with getEmployeeType method in (Employee, Permanent,Seasonal,Temporary).
8. createEmployeeList for all (Permanent,Seasonal,Temporary)
9. printEmployeeType -  using Polymorphism (partially), getEmployeeType() method in Employee, override
10. showAllEmployeeBonus - (Name = Bonus) getBonus() method (Permanent-50,Seasonal-20,Temporary-0)
11. showAllPensionTax - (Name = tax) Double calculatePensionTax() method in Employee (Permanent-7.5%, Seasonal-6.5%,Temporary-0)
12. showAllInsuranceTax -  (Name = tax) calculateInsuranceTax() method (Permanent-1%,Seasonal-0.5%,Temporary-0)
13. All tax constants in one class. As a static variable. method - calculatePercentage
13. showAllSalaryAfterAllTaxes - (Name = tax) calculateSalaryAfterAllTaxes()
14. What if we are adding new type of Employee. PartnerEmployee (xamkor xodim) (Tax - 0, Insurance - 0, Bonus - 75)
    What if we forgot getBonus(), calculatePensionTax() .... methods to write.
    How we can force to override the getEmployeeType(), getBonus() - methods.
15. AbstractClass -> abstract method.
16. Polymorphism - in Detail.


1. printDetail - to'liq chiqishi kerak
2. printEmployeeType - Employee tiplarini chiqarsin
3. getOneTimeBonus - faqat PermanentEmployee da bo'ladi (what if some one forget to implement). Qolganlarida error console ga chiqarsin
4. getHolidayBonus - PermanentEmployee and SeasonalEmployee . Qolganlarida error console ga chiqarsin
5. Tax - PermanentEmployee da bo'ladi. Qolganlarida error console ga chiqarsin
5. Insurance - PermanentEmployee and SeasonalEmployee . Qolganlarida error console ga chiqarsin
