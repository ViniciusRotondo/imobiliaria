"use client";

import Link from "next/link";
import { Navbar } from "flowbite-react";
import Image from "next/image";
import logo from "../../../public/logo.png";
import { FloatingLabel } from "flowbite-react";

export default function Header() {
  return (
    <>
      <Navbar className="flex justify-content">
        <Image
          src={logo}
          width={180}
          height={180}
          alt="Logotipo Gilson Jose Imóveis"
        />

        <FloatingLabel
          color="error"
          className="w-80"
          variant="filled"
          label="Buscar"
        />

        <Navbar.Collapse>
          <div className="grid grid-cols-4 gap-6 sm:mt-4 sm:grid-cols-6 sm:gap-6">
            <div>
                <Link
                    href="#"
                    className="hover:bg-red-900 hover:text-white p-2 rounded"
                    >
                    Home
                </Link>
            </div>
            <div>
                <Link
                    href="#"
                    className="hover:bg-red-900 hover:text-white p-2 rounded"
                    >
                    Aluguel
                </Link>
            </div>
            <div>
                <Link
                    href="#"
                    className="hover:bg-red-900 hover:text-white p-2 rounded"
                    >
                    Terrenos
                </Link>
            </div>
            <div>
                <Link
                    href="#"
                    className="hover:bg-red-900 hover:text-white p-2 rounded"
                    >
                    Prontos
                </Link>
            </div>
            <div>
                <Link
                    href="#"
                    className="hover:bg-red-900 hover:text-white p-2 rounded"
                    >
                    Novos
                </Link>
            </div>
            <div>
                <Link
                    href="#"
                    className="hover:bg-red-900 hover:text-white p-2 rounded"
                    >
                    Contatos
                </Link>
            </div>
        </div>
        </Navbar.Collapse>
      </Navbar>
    </>
  );
}
