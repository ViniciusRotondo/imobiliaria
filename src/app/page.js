"use client"

import FooterOne from "./Components/Footer"
import Header from "./Components/Header"
import CarouselOne from "./Components/Carousel"
import CardOne from "./Components/Card"

export default function Home() {
  return (
    <>
      <Header />
      <CarouselOne />
      <div className="flex justify-between m-4">
        <CardOne />
        <CardOne />
        <CardOne />
        <CardOne />
      </div>
      <FooterOne />
   </>
  )
}
